package com.hyy.highlightpro

/**
 * Create by hyy on 2021/2/6
 *
 */
interface HighlightViewInteractiveAction {

    /**
     *  show [HighlightPro]
     */
    fun show():HighlightProImpl

    /**
     *  dismiss [HighlightPro]
     */
    fun dismiss()

}