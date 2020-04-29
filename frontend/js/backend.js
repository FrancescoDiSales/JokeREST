

function checkJoke()
{

  let jokeType = $("#jokeType").html().toLowerCase();

  $("#jokeModal").modal('show');
  setupJoke("Drum rollings....","...");

 
      fetch('http://localhost:8080/joke/'+jokeType).then( response=> response.json()).then(
        data=>{
              setupJoke(data[0].setup,data[0].punchline);
              });


}

function setupJoke(setup,punchline)
{

  $("#Motivation").html(setup);
  $("#pun").html(punchline);


}
