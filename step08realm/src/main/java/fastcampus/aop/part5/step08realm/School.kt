package fastcampus.aop.part5.step08realm

import io.realm.RealmObject

open class School : RealmObject() {
    var name: String? = null
    var location: String? = null
}