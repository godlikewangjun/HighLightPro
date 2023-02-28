package com.hyy.highlightpro.parameter

/**
 * Create by hyy on 2021/4/1
 */
sealed class Constraints {
    //vertical constraint
    object TopToTopOfHighlight : Constraints()
    object BottomToTopOfHighlight : Constraints()
    object BottomToBottomOfHighlight : Constraints()
    object TopToBottomOfHighlight : Constraints()
    //horizontal constraint
    object StartToStartOfHighlight : Constraints()
    object StartToEndOfHighlight : Constraints()
    object EndToEndOfHighlight : Constraints()
    object EndToStartOfHighlight : Constraints()
    object BottomOfHighlight : Constraints()
    object TopOfHighlight : Constraints()
    object LeftOfHighlight : Constraints()
    object RightOfHighlight : Constraints()

    operator fun plus(locationGravity: Constraints): List<Constraints> {
        return listOf(this, locationGravity)
    }
}
