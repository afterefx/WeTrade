/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.annotation.DrawableRes

enum class numberAdj {
    POS, NEG, ZERO
}

data class Position(
    val price: String,
    val percentage: String,
    val numberAdj: numberAdj,
    val ticker: String,
    val company: String,
    @DrawableRes val id: Int
)
val positions = listOf(
    Position(
        "7,918",
        "0.54",
        numberAdj.NEG,
        "ALK",
        "Alaska Air Group, Inc.",
        R.drawable.home_alk
    ),
    Position(
        "1,293",
        "4.18",
        numberAdj.POS,
        "BA",
        "Boeing Co.",
        R.drawable.home_ba
    ),
    Position(
        "893,50",
        "0.54",
        numberAdj.NEG,
        "DAL",
        "Delta Airlines Inc.",
        R.drawable.home_dal
    ),
    Position(
        "12,301",
        "2.51",
        numberAdj.POS,
        "EXPE",
        "Expedia Group Inc.",
        R.drawable.home_exp
    ),
    Position(
        "12,301",
        "1.38",
        numberAdj.POS,
        "EADSY",
        "Airbus SE",
        R.drawable.home_eadsy
    ),
    Position(
        "8,521",
        "1.56",
        numberAdj.POS,
        "JBLU",
        "Jetblue Airways Corp.",
        R.drawable.home_jblu
    ),
    Position(
        "521",
        "2.75",
        numberAdj.POS,
        "MAR",
        "Marriott International Inc.",
        R.drawable.home_mar
    ),
    Position(
        "5,481",
        "0.14",
        numberAdj.POS,
        "CCL",
        "Carnival Corp",
        R.drawable.home_ccl
    ),
    Position(
        "9,184",
        "1.69",
        numberAdj.POS,
        "RCL",
        "Royal Caribbean Cruises",
        R.drawable.home_rcl
    ),
    Position(
        "654",
        "3.23",
        numberAdj.POS,
        "TRVL",
        "Travelocity Inc.",
        R.drawable.home_trvl
    )

)
