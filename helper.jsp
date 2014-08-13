<%@ page import="java.io.*,java.util.*, java.net.*" %>

<html>
	
	<body>
		
		<table>
		
			<%
				try{
					
					URL url = new URL(request.getParameter("myText"));
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
					BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
						
					String output = br.readLine();
				
					String result [] = output.split("<br>");
			
					out.println("Number of lines:"+result.length);
			
					String arr[][] = new String[result.length][2];
			
					for (int i = 0; i <result.length; i++){
						
						StringTokenizer st = new StringTokenizer(result[i],",");
						arr[i][0]=st.nextToken();
						arr[i][1]=st.nextToken();
				
						out.println("<tr>"+"<td>"+arr[i][0]+"</td>"+"<td>"+arr[i][1]+"</td>"+"</tr>");
					}
			
				} catch (IOException e) {
					e.printStackTrace();
				}
		
			%>
		
		</table>

	</body>
	
</html>