function sukses(result){
	$("#msg").html( "<span style='color: green'>Customer added successfully</span>" );
		
	setTimeout(function() { 
		$("#modal-default").modal('hide');
		$("#name").val('');
		$("#email").val('');
		$("#address").val('');
		$("#msg").html("");
	}, 1000);
	tampilkanTabel();	
}

function tampilkanTabel(){
	$('#list').empty();
	$.getJSON('http://localhost:8080/customerList', function(json) {
				var tr=[];
					tr.push('<thead>');
					tr.push('<tr>');
					tr.push('<th>ID</th>');
					tr.push('<th>Name</th>');
					tr.push('<th>Email</th>');
					tr.push('<th>Address</th>');
					tr.push('<th>Actions</th>');
					tr.push('</tr>');
					tr.push('</thead>');
					tr.push('<tbody>');
				for (var i = 0; i < json.length; i++) {
					tr.push('<tr>');
					tr.push('<td>' + json[i].id + '</td>');
					tr.push('<td>' + json[i].name + '</td>');
					tr.push('<td>' + json[i].email + '</td>');
					tr.push('<td>' + json[i].address + '</td>');
					tr.push('<td><button class=\'btn btn-warning edit\'>Edit</button>&nbsp;&nbsp;<button class=\'btn btn-danger delete\' id=' + json[i].id + '>Delete</button></td>');
					tr.push('</tr>');
				}
				tr.push('</tbody>');
				$('table').append($(tr.join('')));
			});
}

$(document).ready(function() {
			$("#tombolAddModal").click(function() {
				$("#modal-default").modal('show');
			})
			tampilkanTabel();
			
			$('.close').click(function(){
				$("#msg").html("");
			})
			
			$('#closeModal').click(function(){
				$("#msg").html("");
			})
			
			$(document).ready(function(){
			  $("#myInput").on("keyup", function() {
			    var value = $(this).val().toLowerCase();
			    $("#list tr").filter(function() {
			      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
			    });
			  });
			});
			
			$(document).delegate('#addNew', 'click', function(event) {
				event.preventDefault();
				
				var name = $('#name').val();
				var email = $('#email').val();
				var address = $('#address').val();
				
				if (address == ""){
					$("#msg").html("<span style='color: red'>Address is required</span>")
				}
				if (email == ""){
					$("#msg").html("<span style='color: red'>Email is required</span>")
				}
				if (name == ""){
					$("#msg").html("<span style='color: red'>Name is required</span>")
				}
				
				if (name != "" && email != "" && address != ""){
				
				$.ajax({
					type: "POST",
					contentType: "application/json; charset=utf-8",
					url: "http://localhost:8080/customer/save",
					data: JSON.stringify(
						{'name': name,
						'email': email,
						'address': address}),
					cache: false,
					success: sukses,
					error: function(err) {
						$("#msg").html( "<span style='color: red'>Name is required</span>" );
					}
				});
				}
			});
			
			$(document).delegate('.delete', 'click', function() { 
				if (confirm('Do you really want to delete record?')) {
					var id = $(this).attr('id');
					var parent = $(this).parent().parent();
					$.ajax({
						type: "DELETE",
						url: "http://localhost:8080/customer/delete/" + id,
						cache: false,
						success: function() {
							parent.fadeOut('slow', function() {
								$(this).remove();
							});
							tampilkanTabel();
						},
						error: function() {
							$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error deleting record').fadeIn().fadeOut(4000, function() {
								$(this).remove();
							});
						}
					});
				}
			});
			
			$(document).delegate('.edit', 'click', function() {
				var parent = $(this).parent().parent();
				
				var id = parent.children("td:nth-child(1)");
				var name = parent.children("td:nth-child(2)");
				var email = parent.children("td:nth-child(3)");
				var address = parent.children("td:nth-child(4)");
				var buttons = parent.children("td:nth-child(5)");
				
				name.html("<input type='text' id='name' value='" + name.html() + "'/>");
				email.html("<input type='text' id='email' value='" + email.html() + "'/>");
				address.html("<input type='text' id='address' value='" + address.html() + "'/>");
				buttons.html("<button class='btn btn-warning' id='save'>Save</button>&nbsp;&nbsp;<button class='btn btn-danger delete' id='" + id.html() + "'>Delete</button>");
			});
			
			$(document).delegate('#save', 'click', function() {
				var parent = $(this).parent().parent();
				
				var id = parent.children("td:nth-child(1)");
				var name = parent.children("td:nth-child(2)");
				var email = parent.children("td:nth-child(3)");
				var address = parent.children("td:nth-child(4)");
				var buttons = parent.children("td:nth-child(5)");
				
				$.ajax({
					type: "POST",
					contentType: "application/json; charset=utf-8",
					url: "http://localhost:8080/customer/save",
					data: JSON.stringify(
						{'id' : id.html(), 
						'name' : name.children("input[type=text]").val(), 
						'email' : email.children("input[type=text]").val(), 
						'address' : address.children("input[type=text]").val()}),
					cache: false,
					success: function() {
						name.html(name.children("input[type=text]").val());
						email.html(email.children("input[type=text]").val());
						address.html(address.children("input[type=text]").val());
						buttons.html("<button class='btn btn-warning edit' id='" + id.html() + "'>Edit</button>&nbsp;&nbsp;<button class='btn btn-danger delete' id='" + id.html() + "'>Delete</button>");
					},
					error: function() {
						$('#err').html('<span style=\'color:red; font-weight: bold; font-size: 30px;\'>Error updating record').fadeIn().fadeOut(4000, function() {
							$(this).remove();
						});
					}
				});
			});

		});