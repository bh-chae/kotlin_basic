package lastChapter_EX

fun main() {

 /*   //보드 생성
    var board = Array<CharArray>(3, {CharArray(3, {' '})})
    inItBoard(board)

    //플레이어 배열
    val names =  arrayOf("Player1", "Player2")

    //marks 배열
    val marks = arrayOf('O', 'X')

    play(board, names, marks)*/



}
/*
//초기화 함수
fun inItBoard(board: Array<CharArray>){
    for(i in 0..2){
        for(j in 0..2){
            board[i][j] = ' '
        }
    }
}
//return Type
fun inItBoardReturn(board: Array<CharArray>): Array<CharArray> {
    inItBoard(board)
    return board
}


//출력 함수
fun printBoard(board: Array<CharArray>){
    println ("\t0\t1\t2")
    for(i in 0..2){
        for(j in 0..2){
            if(j==0){
                print("$i")
            }
            print("\t|${board[i][j]}")
        }
        println()
        println("\t--\t--\t--")
    }

}

//격자 범위 (0~2 내에 있는지 검사)
val isInRange = {x: Int, y: Int ->
    (x in 0..2) && (y in 0..2)
}

//격자의 칸이 빈칸인지 검사
fun isValid(board: Array<CharArray>, x: Int, y: Int): Boolean{
    return isInRange(x, y) && board[x][y] == ' '
}

//player Input
fun playerInput(name: String, board: Array<CharArray>): Boolean {
    print("$name 입력(줄,칸): ")
    val input: String? = readLine()
    val arr = input!!.split(",")
    //___(4) 입력 받은 값을 split( )함수를 이용해 x와 y로 분리 저장___
    x = arr[0].toInt()
    y = arr[1].toInt()
    if (!isValid(board, x, y)) return false
    return true
}

// 해당 칸이 승리할 수 있는지 검사
fun isWin(board: Array<CharArray>, x: Int, y: Int): Boolean {
    // 가로, 세로, 우하 대각선, 우상 대각선 방향에 대한 x, y 변화량
    val dx = arrayOf(-1, 1, 0, 0, -1, 1, 1, -1)
    val dy = arrayOf(0, 0, -1, 1, -1, 1, -1, 1)

    for (d in 0..3) {
        var count = 1
        for (b in 0..1) {
            val index = 2 * d + b
            var cx = x + dx[index]
            var cy = y + dy[index]
            while (isInRange(cx, cy)) {
                if (board[cy][cx] == board[y][x]) count++
                cx += dx[index]
                cy += dy[index]
            }
        }
        if (count == 3) return true
    }
    return false
}

fun play(board: Array<CharArray>, name: Array<String>, marks: Array<Char>){
    var round = 0
    var turn = 0

    while (true) {
        println("\n ${turn + 1}번째 턴\n")
        printBoard(board)
        if (!playerInput(name[turn], board))
            continue
        board[y][x] = marks[turn]
        round++

        // ___(5) 승리 혹은 무승부 조건을 검사, 이 두 조건은 while루프를 끝낸다___
        if (isWin(board, x, y)) {
            printBoard(board)
            println("${name[turn]} 승리!")
            break
        } else {
            if (round == 9) {
                printBoard(board)
                println("무승부 입니다.")
                break
            }
            //___(6) turn이 0이며 1로, 1이면 0으로 바꿔서 플레이어 판단___
            turn = if (turn == 1) 0 else 1

        }
    }
}



*/