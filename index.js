const input = document.querySelector('.check-num')
const inputBtn = document.querySelector('.check-num-btn')
const resultContainer = document.querySelector('.result')


inputBtn.onclick = () => {
    const array = []
    resultContainer.innerHTML = null
    const userNumber = input.value

    if(userNumber > 0 && userNumber % 1 === 0) {
        for(let i = 2; userNumber > i; i++) {
            if(userNumber % i ===0) {
                array.push(" " + i)
            }
        }
        if(array.length !== 0) {
            resultContainer.innerHTML = "Dzielniki liczby " + `<b>${userNumber}</b>` + " to: " + `<br />` + array
        } else {
            resultContainer.innerHTML = "Liczba " + `<b>${userNumber}</b>` + " jest liczbą pierwszą i dzieli się wyłącznie przez samą siebie :)"
        }
    } else {
        alert("podaj poprawną liczbę!")
    }
    input.value = null
}

