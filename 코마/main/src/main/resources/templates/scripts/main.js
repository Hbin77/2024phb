function performSearch() {
    const query = document.getElementById('searchInput').value.trim();
    if (query === "") {
        alert("검색어를 입력하세요!");
        return;
    }

    if (query === "급성 폐혈증") {
        window.location.href = "./result.html";
    } else {
        alert(`"${query}"에 대한 검색 결과가 없습니다.`);
    }
}