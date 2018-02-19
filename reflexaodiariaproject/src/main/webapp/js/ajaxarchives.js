$(document).ready(function(){
    
    
        var btn3 = $("#btn-logout");
    
        btn3.on('click',function(){
        
     
            if (window.confirm('Wanna Logout? ')){
            	
            	$.post("Doall?tarefa=Logout",
                    function(data){
            		if (data == 'True') {
                     $("#resposta").html(data);
                     window.location.reload();
            		}
            		else
                		alert("not Logged");
            	});
            	
            	
            }else
            	return false;
            
            
        });
    });
    
    