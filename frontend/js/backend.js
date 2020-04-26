

function checkJoke()
{

  let jokeType = $("#jokeType").val();
  console.log(jokeType);

  fetch('http://localhost:8080/joke/'+jokeType,
    {
      headers:{'Content-Type': 'application/json',"Access-Control-Allow-Origin":"*"}
    }
  ).then( response=>{

      console.log(response.json());


    });



}
