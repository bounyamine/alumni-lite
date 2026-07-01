# Retrofit
-keepattributes Signature
-keepattributes *Annotation*
-keep class sun.misc.Unsafe { *; }
-dontwarn okhttp3.**
-dontwarn retrofit2.**
-dontwarn javax.annotation.**

# Moshi
-keepclasseswithmembers class * {
    @com.squareup.moshi.* <methods>;
}
-keep @com.squareup.moshi.JsonClass class * { *; }

# Room
-keep class * extends androidx.room.RoomDatabase
-keep @androidx.room.Entity class *
-dontwarn androidx.room.paging.**

# Hilt
-keep class dagger.hilt.android.internal.managers.* { *; }
-keep class dagger.hilt.** { *; }
-keep,allowobfuscation interface dagger.hilt.android.lifecycle.**

# Kotlinx Serialization
-keepattributes RuntimeVisibleAnnotations,AnnotationDefault

# Your app
-keep class com.enspm.alumni.data.models.** { *; }
-keep class com.enspm.alumni.domain.models.** { *; }

-dontwarn kotlinx.**
-dontwarn androidx.**