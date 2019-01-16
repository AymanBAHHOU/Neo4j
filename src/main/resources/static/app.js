
var depart;
var destination;

$(document).ready(function() {
	$('#btnSubmit').click(function(){
		depart = $('#depart').val();
		destination = $('#destination').val();
		console.log(depart + "---"+destination);
		$.ajax({
	        type : "GET",
	        url : "http://localhost:8081/itineraries?depart=" + depart + "&destination=" + destination,
	        success : function(result){
	            console.log("result ", result);
	            $('#results-container').empty();
	            length = Object.keys(length).length;
	            $.each(result, function(i, node, length){
	            	nodeToHtml(i,node);
	            });
	        },
	        error : function(e){
	            alert("ERROR: ", e);
	            console.log("ERROR: ", e);
	        }
	    });
	});
	
});

function nodeToHtml(i, node, length){
	j = i%2;
	k=0;
	console.log('type = ', typeof(length));
	console.log('length = ', length);
	var integer = Number(length);
	if(j == 0){
		if(k==0){
			$('#results-container').append('<div class="p-2 alert alert-info">' + node.name + '</div>');
			if(i+1 < integer){
				$('#results-container').append('<img src="downAr.png"/>');
			}
			k = 1;
		}else{
			$('#results-container').append('<div class="p-2 alert alert-info">' + node.name + '</div>');
			if(i+1 < integer){
				$('#results-container').append('<div class="p-2 alert alert-info">' + node.name + + '</div>');
				$('#results-container').append('<img src="downAr.png"/>');
			}
			k = 0;
		}
	}else{
		$('#results-container').append('<div class="p-2 alert alert-success"> <strong>BUS</strong> : ' + node.immat + '</div>');
		$('#results-container').append('<img src="downAr.png"/>');
	}
}

