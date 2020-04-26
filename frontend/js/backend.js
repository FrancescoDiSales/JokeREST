

function checkJoke()
{

  let jokeType = $("#jokeType").val();

  setupJoke("Drum rollings....","...");

  try
  {
      fetch('http://localhost:8080/joke/'+jokeType).then( response=> response.json()).then(
        data=>{
              setupJoke(data[0].setup,data[0].punchline);
              });


  }
  catch(exception)
  {

      setupJoke("Where is the punchline?","There is no punchline... (sorry an error happened)");

  }

}

function setupJoke(setup,punchline)
{

  $("#Motivation").html(setup);
  $("#pun").html(punchline);


}
