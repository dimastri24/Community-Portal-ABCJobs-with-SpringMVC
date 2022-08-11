/**
 * 
 */
$(document).ready(function() {
	
	$.validator.setDefaults({
		errorClass: "invalid-feedback",
		highlight: function(element){
			$(element)
				.closest('.form-control')
				.addClass('is-invalid')
		},
		unhighlight: function(element){
			$(element)
				.closest('.form-control')
				.removeClass('is-invalid')
		}
	})
	
	$("#resetPass").validate({
		
		rules: {
	        pass1: {
	          required: true,
	          minlength: 6,
	          maxlength: 25,
	          normalizer: function(value) {
					  return $.trim(value);
				    }
	        },
	        pass2: {
	            required: true,
	            equalTo: '#pass1'
	          },
	      },
	      messages: {
	        pass1: {
	          required: 'Password is required'
	        },
	        pass2: {
	            required: 'Confirm password is required',
	            equalTo: 'Password did not match, Please enter the same password'
	          }
	      }
	})
})
