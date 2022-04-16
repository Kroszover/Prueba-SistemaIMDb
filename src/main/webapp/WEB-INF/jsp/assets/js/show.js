var stars;
		document.addEventListener('DOMContentLoaded', () => {
			stars = document.querySelectorAll(".reviewStars1 span");

			stars.forEach(item => {
				item.addEventListener('click', function () {
					var rating = this.getAttribute("data-rating");
					return SetRatingStar(rating, stars);
				});
			});
		});

/**
* SetRatingStar sets the rating on page
*
* @param {int} rating           Int of the rating value. 
* @returns {object} stars       html stars elements
*
*/
		function SetRatingStar(rating, stars) {
			var len = stars.length;
			console.log(rating);

			for (var i = 0; i < len; i++) {
				if (i < rating) {
					stars[i].innerHTML = '<i class="fas fa-star"></i>';
				} else {
					stars[i].innerHTML = '<i class="far fa-star"></i>';
				}
			}

		};

var stars;
		document.addEventListener('DOMContentLoaded', () => {
			stars = document.querySelectorAll(".reviewStars2 span");

			stars.forEach(item => {
				item.addEventListener('click', function () {
					var rating = this.getAttribute("data-rating");
					return SetRatingStar(rating, stars);
				});
			});
		});

/**
* SetRatingStar sets the rating on page
*
* @param {int} rating           Int of the rating value. 
* @returns {object} stars       html stars elements
*
*/
		function SetRatingStar(rating, stars) {
			var len = stars.length;
			console.log(rating);

			for (var i = 0; i < len; i++) {
				if (i < rating) {
					stars[i].innerHTML = '<i class="fas fa-star"></i>';
				} else {
					stars[i].innerHTML = '<i class="far fa-star"></i>';
				}
			}

		};