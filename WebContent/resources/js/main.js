
$(document).ready(function(){
	
	
	
	   $("#btnAdd").click(function(){
	    	dataString = $("#formAddMovie").serialize();
	    	$.ajax({
	    		type: "POST",
	    		url: "Movies",
	    		data: dataString,
	    		dataType:"json",
	    		
	    		success: function (data , testStatus, jqXHR) {
	    			
	    			if (data.success){
	    				$('#dataTable').append('<tr><td>'+data.movie.name +'</td><td>'+ data.movie.release+'</td></tr>');
	    				alert("Movie Added");
	    				
	    			}else{
	    				alert("something bad happend");
	    			}
	    			
	    		},
	    		error: function (jqXHR,textStatus,errorThrown){
	    		     console.log("something bad happend");
	    		}
	    	});

	    });
	   
	   $("#btnSearch").click(function(){
	    	dataString = $("#formSearch").serialize();
	    	$.ajax({
	    		type: "POST",
	    		url: "Search",
	    		data: dataString,
	    		dataType:"json",
	    		
	    		success: function (data , testStatus, jqXHR) {
	    			console.log(data);
	    			if (data.success){
	    				$('span').append(data.name.name);
	    				
	    			}else{
	    				alert("something bad happend");
	    			}
	    			
	    		},
	    		error: function (jqXHR,textStatus,errorThrown){
	    		     console.log("something bad happend");
	    		}
	    	});

	    });
	
	
});