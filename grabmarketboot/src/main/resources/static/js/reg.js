function saveProduct() {
  //   alert("save"); //메시지 창 팝업
  var form = document.querySelector("#saveForm"); //CSS클래스 ID를 그대로 쓸 수 있음 #saveForm을 불러와서 form에 저장
  form.action = "/grab/product-reg";
  form.method = "Post";
  form.submit(); //(product-reg에 있는)단순 버튼으로는 기능이 수행이 안돼서 여기에서 버튼의 기능을 정의해줌 (action/method 등)
}

function uploadImage() {
  alert("uploadImage");
  axios
    .post("/api/imageupload", form)
    .then(function (response) {})
    .catch(function () {
      console.log("실패");
    });
}
