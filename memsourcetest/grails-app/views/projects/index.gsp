<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Memsource - Projects</title>

</head>
<body>
	<div class="container">

		<table class="table table-hover">
			<thead>
				<tr>
					<th>Name</th>
					<th>Status</th>
					<th>Source language</th>
					<th>Target languages</th>
				</tr>
			</thead>
			<tbody id="body">
			</tbody>
		</table>
	</div>
	<asset:script>
	$.ajax({
        url: '${createLink(controller:"projects",action:"list")}',
        success: function (response) {
        var trHTML = '';
        $.each(JSON.parse(response), function (i, item) {
            trHTML += '<tr><td>' + item.name + '</td><td>' + item.status + '</td><td>' + item.sourceLang + '</td><td>' + item.targetLangs + '</td></tr>';
        });
        $('#body').append(trHTML);
    }
});</asset:script>
</body>
</html>
