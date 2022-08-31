/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
                Affirmation(R.string.affirmation1, "https://ornamentalis.com/wp-content/uploads/2021/09/significado-flor-cerezo-sakura-japon-750x422.jpg"),
                Affirmation(R.string.affirmation2, "https://i.pinimg.com/originals/38/6f/74/386f74f0acacf09da35801a4ad4fd062.jpg"),
                Affirmation(R.string.affirmation3, "https://www.vibetv.mx/wp-content/uploads/2022/03/sakura-cdmx-florecen-vibetv.jpg"),
                Affirmation(R.string.affirmation4, "https://s3.voyapon.com/wp-content/uploads/sites/3/2020/01/13190037/voyapon_cherry_blossom_tokyo_01.jpg"),
                Affirmation(R.string.affirmation5, "https://www.gotokyo.org/es/story/guide/the-japanese-cherry-blossom-trees/images/main.jpg"),
                Affirmation(R.string.affirmation6, "https://culturacolectiva-cultura-colectiva-prod.cdn.arcpublishing.com/resizer/b9lVqcSNi-18AgjBa5_E_rqlYYw=/1024x768/filters:format(jpg):quality(70)/cloudfront-us-east-1.images.arcpublishing.com/culturacolectiva/OYIEE2XN3BDE3KHDNOGXZ5WICU.jpg"),
                Affirmation(R.string.affirmation7, "https://www.jardineriaon.com/wp-content/uploads/2019/01/flor-de-sakura-1.jpg"),
                Affirmation(R.string.affirmation8, "https://sushifactoryblog.files.wordpress.com/2021/03/aomori2204_18.jpeg"),
                Affirmation(R.string.affirmation9, "https://ikigaimatsuri.com/wp-content/uploads/2020/03/pronostico-de-sakuras.jpg"),
                Affirmation(R.string.affirmation10, "https://cloudfront-us-east-1.images.arcpublishing.com/infobae/ALEQK7IHNZBYVI5EINJ55K334Y.jpg"))
    }
}

