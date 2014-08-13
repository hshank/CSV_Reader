<%@ page import="java.io.*,java.util.*, java.net.*" %>

<html>

	<head>
		
		<title>Comma Separated Data</title>

		<script>
			function fetchData(){
			
				str=document.getElementById("myext").value;
				var xmlhttp;

				if (str.length==0){
					document.getElementById("responseText").innerHTML="";
					return;
				}
				if (window.XMLHttpRequest){
					xmlhttp=new XMLHttpRequest();
				}
				else{
					xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				}
				
				xmlhttp.onreadystatechange=function() {
					if ( xmlhttp.readyState==4){
						document.getElementById("responseText").innerHTML=xmlhttp.responseText;
					}
				}
  
				xmlhttp.open("GET","/CSVReader/helper.jsp?myText="+str,true);
				xmlhttp.send();
			}
		</script>

	</head>
	
	<body>
				
		<table>
			 <form action="index.jsp">  
				<table border="1">  
					<tr>  
						<td>Text:</td>  
						<td><input type="text" name="myText" id="myext" size = "100" value=""></td>  
						<td><input type="button" onClick="fetchData();" value="Click to Submit"></td>  
					</tr>  
				</table>  
			</form> 
			<div id="responseText">
			</div> 
		
	</body>
	
</html>