<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Form</h1>
<form action="read.jsp">
			<table>
				<tr>
					<td>Id</td>
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<td>Technology</td>
					<td><input type="checkbox" name="a" value="Java">Java<br>
					<input type="checkbox" name="s" value="c#">C#<br>
					<input type="checkbox" name="d" value="Angular">Angular<br>
					<input type="checkbox" name="f" value="Python">Python<br>
					<input type="checkbox" name="g" value="React">react<br>
					<input type="checkbox" name="h" value="AWS">AWS<br></td>
				</tr>
					<tr>
					<td>Gender</td>
					<td><input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br></td>
				</tr>
				<tr>
					<td>Qualification</td>
					<td><select name="select">
 						 <option value="MSc">MSc</option>
 						 <option value="BE">BE</option>
 						 <option value="BTech">BTech</option>
 						 <option value="MS">MS</option>
					</select></td>
				</tr><td>
			<input type="submit" value="Submit"/></td>
			<td><input type="reset" value="Clear"  /></td></tr></table>
			</form>
</body>
</html>