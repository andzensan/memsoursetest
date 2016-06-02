<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Memsource - Setup</title>

</head>
<body>
	<g:if test="${message}">
		<div class="alert alert-success" role="alert">
			${message}
		</div>
	</g:if>
	<g:hasErrors bean="${userInstance}">
			<h3 class="alert alert-danger">
				Error!
			</h3>
	</g:hasErrors>
	<div class="container">
		<g:form class="form-horizontal" controller="user" action="update">
			<div class="form-group">
				<label for="username" class="col-sm-2 control-label">Username</label>
				<div class="col-sm-8">
					<input type="text" class="form-control" id="username"
						value="${userInstance.username}" name="username"
						placeholder="Username">
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-2 control-label">Password</label>
				<div class="col-sm-8">
					<input type="password" class="form-control" id="password"
						value="${userInstance.password}" name="password"
						placeholder="Password">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-8">
					<button type="submit" class="btn btn-default">Update</button>
				</div>
			</div>
		</g:form>
	</div>
</body>
</html>
