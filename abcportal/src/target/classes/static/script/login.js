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
	
	$.validator.addMethod("customEmail", function (value, element) {
    return this.optional(element) || /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(value);
	}, "Please enter valid email address!");
	
	$("#loginForm").validate({
		
		rules: {
	        email: {
	          required: true,
	          customEmail: true
	        },
	        pass: {
	          required: true,
	          minlength: 6,
	          maxlength: 25,
	          normalizer: function(value) {
					  return $.trim(value);
				    }
	        },
	      },
	      messages: {
	        email: {
	          required: 'Email is required'
	        },
	        pass: {
	          required: 'Password is required'
	        }
	      }
	})
})
