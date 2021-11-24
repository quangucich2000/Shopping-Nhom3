<div id="logreg-forms">
	<form class="form-signin" action="login" method="post">
		<h1 class="h3 mb-3 font-weight-normal" style="text-align: center">
			Sign in</h1>

		<input name="username" type="text" id="inputEmail" class="form-control"
			placeholder="Username" required="" autofocus=""> 
		<input name="password" type="password" id="inputPassword" class="form-control"
			placeholder="Password" required="">

		<div class="form-group form-check">
			<input name="remember" value="1" type="checkbox"
				class="form-check-input" id="exampleCheck1"> <label
				class="form-check-label" for="exampleCheck1">Remember me</label>
		</div>

		<button class="btn btn-success btn-block" type="submit">
			<i class="fas fa-sign-in-alt"></i> Sign in
		</button>
		<hr>
		<button class="btn btn-primary btn-block" type="button"
			id="btn-signup">
			<i class="fas fa-user-plus"></i> Sign up New Account
		</button>
	</form>

	<form action="signup" method="post" class="form-signup">
		<h1 class="h3 mb-3 font-weight-normal" style="text-align: center">
			Sign up</h1>
		<input name="user" type="text" id="user-name" class="form-control"
			placeholder="User name" required="" autofocus=""> 
		<input name="pass" type="password" id="user-pass" class="form-control"
			placeholder="Password" required autofocus=""> 
		<input name="repass" type="password" id="user-repeatpass"
			class="form-control" placeholder="Repeat Password" required
			autofocus="">
		<input name="phonenumber" type="text" id="phonenumber" class="form-control"
			placeholder="Phonenumber" required="" autofocus=""> 

		<button class="btn btn-primary btn-block" type="submit">
			<i class="fas fa-user-plus"></i> Sign Up
		</button>
		<a href="#" id="cancel_signup"><i class="fas fa-angle-left"></i>
			Back</a>
	</form>
	<br>

</div>