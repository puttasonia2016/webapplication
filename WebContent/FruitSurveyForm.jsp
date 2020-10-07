<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FruitRegistration" method="post">
<table align="center" bgcolor="yellow">
<h1 style=background-color:orange;color:white;text-align:center;padding:30px;>The WorldofFruit</h1>
<tr><th><h2 style=color:black;text-align:center>Fruit Survey</h2></th></tr>
<tr><td>
<table> 
<tr><td><B> Name:<font color=red></font></B><td><input type="text" name="name" size=30></td>
</tr>
<tr><td><B>Address:<font color=red></font></B><td><input type="text" name="address" size=30></td>
</tr>
<tr><td><B>Email:<font color=red></font></B><td><input type="text" name="email" size=30></td>
</tr>
<tr><td><B>How many pieces of fruit do you eat per day<font color=red></font></B><td><input type="radio" name="fruitid" value="0">0</td></tr>
<tr>
<td></td>
<td><input type="radio" name="fruitid" value="1">1</td></tr>
<tr>
<td></td>
<td><input type="radio" name="fruitid" value="2">2</td></tr>
<tr>
<td></td>
<td><input type="radio" name="fruitid" value="morethan2">More than 2</td></tr>
<tr><td><B>My favourite fruit:<font color=red></font></B><td><select name="fruitname">
<option value="Apple">Apple</option>
<option value="Banana">Banana</option>
<option value="Plum">Plum</option>
<option value="poemegranate" selected>Pomegranate</option>
</select>
</td>
</tr>
<tr>
<td>Would you like a brochure? <font color=red></font></B><td><input type="checkbox" name="bouncher" value="yes"><td></tr>
<tr>
<td><b><input type="submit" value="Submit"></b>
</td>
</tr>
</table>
</form>
</body>
</html>