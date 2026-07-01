package com.enspm.alumni.data.models.profile

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateProfileRequest(val name: String? = null, val phone: String? = null, val domain: String? = null, val graduation_year: Int? = null, val is_worker: Boolean? = null)

@JsonClass(generateAdapter = true)
data class Academic(val id: Long, val school: String, val field: String, val diploma: String? = null, val start_year: Int, val end_year: Int? = null)

@JsonClass(generateAdapter = true)
data class AddAcademicRequest(val school: String, val field: String, val start_year: Int, val diploma: String? = null, val end_year: Int? = null)

@JsonClass(generateAdapter = true)
data class UpdateAcademicRequest(val id: Long, val school: String? = null, val field: String? = null, val diploma: String? = null, val start_year: Int? = null, val end_year: Int? = null)

@JsonClass(generateAdapter = true)
data class DeleteAcademicRequest(val id: Long)

@JsonClass(generateAdapter = true)
data class Experience(val id: Long, val company: String, val position: String, val start_date: String, val end_date: String? = null, val description: String? = null)

@JsonClass(generateAdapter = true)
data class AddExperienceRequest(val company: String, val position: String, val start_date: String, val end_date: String? = null, val description: String? = null)

@JsonClass(generateAdapter = true)
data class UpdateExperienceRequest(val id: Long, val company: String? = null, val position: String? = null, val start_date: String? = null, val end_date: String? = null, val description: String? = null)

@JsonClass(generateAdapter = true)
data class DeleteExperienceRequest(val id: Long)

@JsonClass(generateAdapter = true)
data class Skill(val id: Long, val label: String, val level: String)

@JsonClass(generateAdapter = true)
data class AddSkillRequest(val label: String, val level: String)

@JsonClass(generateAdapter = true)
data class UpdateSkillRequest(val id: Long, val label: String? = null, val level: String? = null)

@JsonClass(generateAdapter = true)
data class DeleteSkillRequest(val id: Long)

@JsonClass(generateAdapter = true)
data class Interest(val id: Long, val label: String)

@JsonClass(generateAdapter = true)
data class AddInterestRequest(val label: String)

@JsonClass(generateAdapter = true)
data class UpdateInterestRequest(val id: Long, val label: String)

@JsonClass(generateAdapter = true)
data class DeleteInterestRequest(val id: Long)