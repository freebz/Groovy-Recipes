// 8.13 Creating HTML on the Fly

def x = new groovy.xml.MarkupBuilder()
x.html{
  head{
    title("Search Results")
    link(rel:"stylesheet", type:"text/css", href:"http://main.css")
    script(type:"text/javascript", src:"http://main.js")
  }
  body{
    h1("Search Results")
    div(id:"results", class:"simple"){
      table(border:1){
	tr{
	  th("name")
	  th("Address")
	}
	tr{
	  td{
	    a(href:"http://abc.org?id=100","Jane Doe")
	  }
	  td("123 Main St")
	}
      }
    }
  }
}
// ===>
// <html>
//   <head>
//     <title>Search Results</title>
//     <link rel='stylesheet' type='text/css' href='http://main.css' />
//     <script type='text/javascript' src='http://main.js' />
//   </head>
//   <body>
//     <h1>Search Results</h1>
//     <div id='results' class='simple'>
//       <table border='1'>
//         <tr>
//           <th>name</th>
//           <th>Address</th>
//         </tr>
//         <tr>
//           <td>
//             <a href='http://abc.org?id=100'>Jane Doe</a>
//           </td>
//           <td>123 Main St</td>
//         </tr>
//       </table>
//     </div>
//   </body>
// </html>


// HTML and StreamingMarkupBuilder

def h = {
  head{
    title("Search Results")
    link(rel:"stylesheet", type:"text/css", href:"http://main.css")
    script(type:"text/javascript", src:"http://main.js")
  }
}

def b = {
  body{
    h1("Search Results")
    div(id:"results", class:"simple"){
      table(border:1){
	tr{
	  th("Name")
	  th("Address")
	}
	tr{
	  td{
	    a(href:"http://abc.org?id=100","Jane Doe")
	  }
	  td("123 Main St")
	}
      }
    }
  }
}

def html = new groovy.xml.StreamingMarkupBuilder().bind{
  unescaped << '<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"' +
               '"http://www.w3.org/TR/html14/strict.dtd">'
  html{
    out << h
    out << b
  }
}

def htmlWriter = new FileWriter("test.html")
htmlWriter << html
