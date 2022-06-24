<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
<style type="text/css">
.ddd{

	margin-left: auto;
	margin-right: auto;
}
.form {
  
    margin-bottom: 5px;
}
</style>
</head>
<body>
	
	<div  style="width: 30%"class="ddd" >
	<h1>Employee Form</h1>
	<form action="add" method="post">
		<div>
			<label for="empId">Employee Id</label> <input type="text" id="empId"
				name="empId" style="margin-left: 33px; "class="form"/>
		</div>
		<div>
			<label for="empName">Employee Name</label> <input type="text"
				id="empName" name="empName" class="form"/>
		</div>
		<div>
			<label for="phNo">Phone Number</label> <input type="tel" id="phNo"
				name="phNo" pattern="[0-9]{10}" style="margin-left: 12px; "class="form" />
		</div>
		<div>
			<label for="salary">Salary</label> <input type="text" id="salary"
				name="salary" class="form" style="margin-left: 82px;" />
		</div>
		<div>
			<label for="city">City</label> <input type="text" id="city"
				name="city" class="form" style="margin-left: 82px;" />
		</div>
		<div>
			<input type="submit" value="submit"> 
			<input type="reset" value="reset" style="margin-left: 247px;">
		</div>

	</form></div>

</body>
</html>