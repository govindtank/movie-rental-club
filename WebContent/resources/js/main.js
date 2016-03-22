
$(document).ready(function(){
	
	alert("WORKS");
	
	   $("#add").click(function(){
	    	dataString = $("#").serialize();
	    	$.ajax({
	    		type: "POST",
	    		url: "Movies",
	    		data: dataString,
	    		dataType:"json",
	    		
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