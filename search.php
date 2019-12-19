<!DOCTYPE html>
<html>
<title>List of all saved info</title>
<div class="container">

	<form id="contact" action="" method="post">
		<fieldset>
			<a href="http://localhost/project%202/home.html"><button
					type="button">Home</button></a>
		</fieldset>
	</form>
</div>

<link rel="stylesheet" type="text/css" href="formStyleSearch.css">
<?php 

    $lines = file("data.txt", FILE_IGNORE_NEW_LINES | FILE_SKIP_EMPTY_LINES);
    $data = array_map(function($v){
        list($name, $address, $city, $province, $postal, $phone, $email, $make, $model, $year, $ac, $heated, $camera,  $tpms, $owner, $mileage) = explode("*", $v);
        return ["name" => $name, "address" => $address, "city" => $city, "province" => $province, "postal" => $postal, "phone" => $phone, "email" => $email, "make" => $make, "model" => $model, "year" => $year, "ac" => $ac, "heated" => $heated, "camera" => $camera,  "tpms" => $tpms, "owner" => $owner, "mileage" => $mileage];
    }, $lines);

?>

<table id= "listOfCars"style="border-collapse: collapse; text-align: center; font-size: 12px; width: 100%"
	border="1">
	<tr style="font-weight: bold; background-color: #DCDCDC;">
		<td>Name</td>
		<td>Address</td>
		<td>City</td>
		<td>Province</td>
		<td>Postal Cod</td>
		<td>Phone</td>
		<td>Email</td>
		<td>Make</td>
		<td>Model</td>
		<td>Year</td>
		<td>AC</td>
		<td>Heated Seats</td>
		<td>Camera</td>
		<td>TPMS</td>
		<td>Type of owner</td>
		<td>Mileage</td>
		<td>Link</td>
	</tr>

	<?php foreach($data as $name){ ?>

	<?php 
if ($name["ac"] == "AC") {
    $name["ac"] = "Yes";
} else {
	$name["ac"] = "No";
}
if ($name["heated"] == "Seats") {
    $name["heated"] = "Yes";
} else {
	$name["heated"] = "No";
}
if ($name["camera"] == "Camera") {
    $name["camera"] = "Yes";
} else {
	$name["camera"] = "No";
}
if ($name["tpms"] == "TPMS") {
    $name["tpms"] = "Yes";
} else {
	$name["tpms"] = "No";
}
?>

	<tr style="background-color: #FFFAF0;">
		<td>
			<?php echo $name["name"]; ?>
		</td>
		<td>
			<?php echo $name["address"]; ?>
		</td>
		<td>
			<?php echo $name["city"]; ?>
		</td>
		<td>
			<?php echo $name["province"]; ?>
		</td>
		<td>
			<?php echo $name["postal"]; ?>
		</td>
		<td>
			<?php echo $name["phone"]; ?>
		</td>
		<td>
			<?php echo $name["email"]; ?>
		</td>
		<td>
			<?php echo $name["make"]; ?>
		</td>
		<td>
			<?php echo $name["model"]; ?>
		</td>
		<td>
			<?php echo $name["year"]; ?>
		</td>
		<td>
			<?php echo $name["ac"]; ?>
		</td>
		<td>
			<?php echo $name["heated"]; ?>
		</td>
		<td>
			<?php echo $name["camera"]; ?>
		</td>
		<td>
			<?php echo $name["tpms"]; ?>
		</td>
		<td>
			<?php echo $name["owner"]; ?>
		</td>
		<td>
			<?php echo $name["mileage"]; ?>
		</td>
		<?php $link = "http://www.jdpower.com/cars/".$name["make"]."/".$name["model"]."/".$name["year"]; ?>
		<td>
			<?php echo sprintf("<a href=\"%s\">%s</a>\n", $link,$link); ?>
		</td>


	</tr>
	<?php } ?>

	<?php
$file_handle = fopen("data.txt", "rb");

while (!feof($file_handle) ) {
    $line_of_text = fgets($file_handle);
    $parts = explode('*', $line_of_text);
}
fclose($file_handle);
?>
</table>

</html>