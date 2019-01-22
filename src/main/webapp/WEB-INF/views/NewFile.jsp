<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" >
 <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</head>
<body>

<div class="container">
  <h2>Horizontal form</h2>
  <form class="form-horizontal" method ="post" action="http://localhost:8089/newsportal/success">
    <div class="form-group">
      <label class="control-label col-sm-2" for="title">title:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="title" placeholder="Enter title" name="title">
      </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="catagory">Id:</label>
      <div class="col-sm-10">          
        <input type="TEXT" class="form-control" id="catagory" placeholder="Enter catagory" name="Id">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="description">description:</label>
      <div class="col-sm-10">          
        <input type="TEXT" class="form-control" id="description" placeholder="Enter descriptiom" name="description">
      </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="image">image:</label>
      <div class="col-sm-10">          
        <input type="TEXT" class="form-control" id="image" placeholder="Enter image" name="image">
      </div>
    </div>
    </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="catagory">catagory:</label>
      <div class="col-sm-10">          
        <input type="TEXT" class="form-control" id="catagory" placeholder="Enter catagory" name="catagory">
      </div>
      <div class="form-group">
      <label class="control-label col-sm-2" for="DATE">PD:</label>
      <div class="col-sm-10">          
        <input type="TEXT" class="form-control" id="date" placeholder="Enter catagory" name="date">
      </div>
      
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>
