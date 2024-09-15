package com.alkathirikhalid.composetrainingcourses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 *
 * @author alkathirikhalid
 * @project compose-training-courses
 * @date 15/09/2024
 */
data class Topic(
    @StringRes val name: Int,
    val availableCourses: Int,
    @DrawableRes val imageRes: Int
)