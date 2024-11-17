package pieces

import androidx.compose.ui.unit.IntOffset
import com.example.chessapplication.R.drawable.queen_black
import com.example.chessapplication.R.drawable.queen_white
import pieces.dsl.getPieceMoves


class Queen (
    override val color: Piece.Color,
    override var position: IntOffset
): Piece {
    override val drawable: Int =
        if (color.isWhite)
            queen_white
        else
            queen_black

    override fun getAvailableMoves(pieces: List<Piece>): Set<IntOffset> =
        getPieceMoves(pieces){
            straightMoves()
            diagonalMoves()
        }

}