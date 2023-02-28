package com.followerlikereport.task.views.weight

import android.graphics.*
import com.hyy.highlightpro.shape.HighlightShape


/**
 *
 * @author Administrator
 * @version 1.0
 * @date 2022/11/23
 */
class AnalysisRectShape(private val radius: Float = 0f) : HighlightShape(radius) {
    override fun initRect(rectF: RectF) {
        super.initRect(rectF)
        rect?.run {
            path.reset()
            path.addRoundRect(
                RectF(rect!!.left+10,rect!!.top+10,rect!!.right-10,rect!!.bottom-10),
                radius,
                radius,Path.Direction.CW)
        }
    }

    override fun drawPath(canvas: Canvas) {
        canvas.drawRoundRect(rect!!,radius,radius,Paint().apply {
            val colors= intArrayOf( Color.parseColor("#FC6500"),Color.parseColor("#F5AC10"))
            shader = LinearGradient(0f,0f,rect!!.right-5,rect!!.bottom-5,colors, arrayOf(0f,1f).toFloatArray(),Shader.TileMode.CLAMP)
        })
        super.drawPath(canvas)

    }
}