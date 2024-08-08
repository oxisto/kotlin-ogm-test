package org.example.graph.edges

import org.example.graph.Node
import org.neo4j.ogm.annotation.GeneratedValue
import org.neo4j.ogm.annotation.Id

abstract class Edge<T : Node> {
    @Id @GeneratedValue var id: Long? = null
}