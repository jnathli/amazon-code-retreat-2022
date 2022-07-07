class World {
    var activeCells: Set<AbsCoord>
    var activeWindow: Pair<AbsCoord, AbsCoord>


}

data class AbsCoord(val x:int, val y:int)