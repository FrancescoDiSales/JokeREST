

function checkJoke()
{

  let jokeType = $("#jokeType").attr("value");
  axios.get('http://localhost:8080/joke/'+jokeType).then
  (
    (response)=>
    {
      console.log(response);
    }

  );



}
