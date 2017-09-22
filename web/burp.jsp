
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">

        <link rel="stylesheet" href="css/bootstrap.min.css">
        <style>
            body 
                {
                padding-top: 50px;
                padding-bottom: 20px;
                }
        </style>
        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">

        <script src="js/vendor/modernizr-2.8.3-respond-1.4.2.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Sentiment Analysis on Yelp Reviews.</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right" role="form">
            <div class="form-group">
              <input type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1 align="center">Burp!</h1>
        <p align="center">Locate The Best Restaurant Nearby You. </p>
<pre> <h4>                   Select The Location: <select>                    
            <option value="LA">New Orleans, LA</option>
            <option value="AZ">Arizona City, AZ</option>
            <option value="KS">Arkansas City, KS</option>
            <option value="MD">Baltimore, MD</option>
            <option value="OH">Chagrin Falls, OH</option>
            <option value="IL">Chicago, IL</option>
            <option value="TX">Dallas, TX</option>
            <option value="PA">Devner, PA</option>
            <option value="FL">Florida City, FL</option>
            <option value="FL">Homestead, FL</option>
            <option value="IL">Indian Creek, IL</option>
            <option value="KS">kansas City, KS</option>
            <option value="MO">Kansas City, MO</option>
            <option value="NV">Las Vegas, NV</option>
            <option value="MN">Minneapolis, MN</option>
            <option value="NV">North Las Vegas, NV</option>
            <option value="KS">Overland Park, KS</option>
            <option value="MN">Saint Paul, MN</option>
            <option value="IL">Vernon Hills, IL</option>
            <option value="DC">Washington, DC</option>
            <option value="NY">Newyork,NY</option>
            <option value="NY">Brooklyn, NY</option>
            <option value="NY">Bayside, NY </option>
            <option value="NY">Great Neck, NY </option>
            <option value="NY">Little Neck, NY</option>
            <option value="NY">Queens, NY</option>
            <option value="NY">Jamaica, NY </option>
            <option value="NY">Park Slope, NY </option>
            <option value="NY">Flushing, NY</option>
            <option value="NY">Long Island City, NY </option>
            <option value="NY">Astoria, NY</option>
            <option value="PR">Carolina, Puerto Rico </option>
            <option value="NC">Carolina Beach, NC </option>
            <option value="NC">Wilmington, NC</option>
            <option value="MA">Boston, MA </option>
            <option value="OR">Eugene, OR</option>
            <option value="OR">Portland, OR</option>
            <option value="NV">Henderson, NV </option>
            <option value="NV">Las Vegas, NV  </option>
            <option value="SC">Greenville, SC</option>
            <option value="NV">Incline Village, NV</option>
            <option value="OK">Tulsa, OK</option>
            <option value="AZ">Phoenix, AZ</option>
            <option value="IA">Muscatine, IA</option> 
            <option value="IA">Davenport, IA </option>
            <option value="CA">Fullerton,CA</option>
            <option value="CA"> Fresno, CA </option>
            <option value="CA"> San Francisco, CA</option>
            <option value="CA"> San Bruno, CA </option>
            <option value="CA"> Santa Monica, CA</option>
            <option value="CA"> Pacific Coast Hwy Malibu, CA</option>
            <option value="CA"> Maywood, CA </option>
            <option value="CA">San Diego, CA </option>
            <option value="CA"> Rancho Cucamonga, CA </option>
            <option value="CA"> Calimesa, CA</option>
            <option value="CA"> Palm Springs, CA </option>
            <option value="CA">San Jose, CA </option>
            <option value="CA">St Los Gatos, CA </option>
            <option value="CA"> San Bernardino, CA </option>
            <option value="CA"> Rialto, CA </option>
            <option value="CA">San Bernardino, CA </option>
            <option value="CA"> Irvine, CA  </option>
            <option value="CA"> Fountain Valley, CA  </option>
            <option value="CA"> Huntington Beach, CA  </option>
            <option value="CA"> Garden Grove, CA</option>
            <option value="CA">Costa Mesa, CA </option>
            <option value="CA"> Oakland, CA  </option>
            <option value="CA"> Emeryville, CA </option>
            <option value="CA"> St Bay Park, CA </option>
            <option value="CA"> Santa Clara, CA </option>
            <option value="CA">  Newport Beach, CA  </option>
            <option value="CA"> Long Beach, CA  </option>
            <option value="CA"> Los Angeles, CA  </option>
            <option value="CA"> Valencia, CA   </option>
            <option value="CA"> Santa Clarita, CA   </option>
            <option value="CA">Simi Valley, CA </option>
            
</select>     Select Price Range <select>
    <option value="$">$</option>
    <option value="$$">$$</option>
    <option value="$$$">$$$</option>
    <option value="$$$$">$$$$</option>
    </select> </pre>

           

 
    

        
        <p align="center"><a class="btn btn-primary btn-lg" href="new.jsp" role="button">Search</a></p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-4">
          <h2>Heading</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
        <div class="col-md-4">
          <h2>Heading</h2>
          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
       </div>
        <div class="col-md-4">
          <h2>Heading</h2>
          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
          <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
        </div>
      </div>

      <hr>

      <footer>
        <p>&copy; Company 2015</p>
      </footer>
    </div> <!-- /container -->        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="js/vendor/jquery-1.11.2.min.js"><\/script>')</script>

        <script src="js/vendor/bootstrap.min.js"></script>

        <script src="js/main.js"></script>

        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <script>
            (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
            e=o.createElement(i);r=o.getElementsByTagName(i)[0];
            e.src='//www.google-analytics.com/analytics.js';
            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
            ga('create','UA-XXXXX-X','auto');ga('send','pageview');
        </script>
    </body>
</html>
