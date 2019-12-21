class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        // "/"(view:"/index")
	"/" (controller:"book", action:"list")
        "500"(view:'/error')
	}
}
