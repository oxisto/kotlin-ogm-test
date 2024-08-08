package org.example.graph

import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id

open class Node {
    @Id @GeneratedValue var id: Long? = null
}