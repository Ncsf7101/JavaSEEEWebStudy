<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.math.*"%>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<%!
			BigInteger count = null;
		%>
		<%!
		    public BigInteger load(File file){
		        BigInteger count = null;
		        try{
		            if(file.exists()){
		                Scanner scan = new Scanner(new FileInputStream(file));
		                if(scan.hasNext()){
		                    count = new BigInteger(scan.next());
		                }
		                scan.close();
		            }else{
		                count = new BigInteger("0");
		                save(file, count);
		            }
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        return count;
		    }
		
		    public void save(File file, BigInteger count){
		        try{
		            PrintStream ps = null;
		            ps = new PrintStream(new FileOutputStream(file));
		            ps.println(count);
		            ps.close();
		        }catch (Exception e){
		            e.printStackTrace();
		        }
		    }
		%>
		<%
			String src = "E:" + File.separator +"JavaFile" + File.separator + "Javaweb"
				+ File.separator + "note" + File.separator + "count.txt";
			File file = new File(src);
			if(session.isNew()){
				synchronized(this){
					count = load(file);
					count = count.add(new BigInteger("1"));
					save(file, count);
				}
			}
		%>
		<h2>您是第<%=count==null?0:count%>位访客</h2>
	</body>
</html>


