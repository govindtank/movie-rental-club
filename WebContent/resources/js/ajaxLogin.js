
$(document).ready(function(){
	
	   $("#add").click(function(){
	    	dataString = $("#").serialize();
	    	$.ajax({
	    		type: "POST",
	    		url: "Login",
	    		data: dataString,
	    		dataType:"text",
	    		
	    		success: function (data , testStatus, jqXHR) {
	    			console.log(data);
	    			
	    			if (data.success){
	    			
	    				
	    			}else{
	    				
	    			}
	    			
	    		},
	    		error: function (jqXHR,textStatus,errorThrown){
	    		     console.log("something bad happend");
	    		}
	    	});

	    });
	
	
});