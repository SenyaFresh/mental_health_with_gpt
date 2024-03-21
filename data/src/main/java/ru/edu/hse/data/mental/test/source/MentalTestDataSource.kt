package ru.edu.hse.data.mental.test.source

import ru.edu.hse.data.mental.test.entities.MentalTestDataEntity
import ru.edu.hse.data.mental.test.entities.MentalTestQuestionEntity

interface MentalTestDataSource {

    /**
     * Get depression test.
     */
    fun getMentalTest(): MentalTestDataEntity

    /**
     * Set mental test answer.
     */
    suspend fun setMentalTestAnswer(mentalQuestion: MentalTestQuestionEntity, answer: String)

}