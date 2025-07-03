<%@ page contentType = "text/html; charset=UTF-8" %>
<%
	int totalRecord = 2026;
	int pageSize = 10;
	int totalPage = (int)Math.ceil((float)totalRecord / pageSize);
	int blockSize = 10; // 블럭 당 보여질 페이지 수
	int currentPage = 1;
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<style>
table {
	border-collapse: collapse;
	border-spacing: 0;
	width: 100%;
	border: 1px solid #ddd;
}

th, td {
	text-align: left;
	padding: 16px;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}
</style>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Points</th>
		</tr>
		<%for(int i=1; i<=pageSize; i++){ %>
		<tr>
			<td>Jill</td>
			<td>Smith</td>
			<td>50</td>
		</tr>
		<%}%>
		<tr>
			<td colspan="3">
				◀
				<%for(int i = 1; i<=blockSize; i++){%>
				[<%=i%>]
				<%} %>
				▶
			</td>
		</tr>
	</table>

</body>
</html>
