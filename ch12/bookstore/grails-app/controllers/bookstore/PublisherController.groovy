package bookstore



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PublisherController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Publisher.list(params), model:[publisherInstanceCount: Publisher.count()]
    }

    def show(Publisher publisherInstance) {
        respond publisherInstance
    }

    def create() {
        respond new Publisher(params)
    }

    @Transactional
    def save(Publisher publisherInstance) {
        if (publisherInstance == null) {
            notFound()
            return
        }

        if (publisherInstance.hasErrors()) {
            respond publisherInstance.errors, view:'create'
            return
        }

        publisherInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'publisher.label', default: 'Publisher'), publisherInstance.id])
                redirect publisherInstance
            }
            '*' { respond publisherInstance, [status: CREATED] }
        }
    }

    def edit(Publisher publisherInstance) {
        respond publisherInstance
    }

    @Transactional
    def update(Publisher publisherInstance) {
        if (publisherInstance == null) {
            notFound()
            return
        }

        if (publisherInstance.hasErrors()) {
            respond publisherInstance.errors, view:'edit'
            return
        }

        publisherInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Publisher.label', default: 'Publisher'), publisherInstance.id])
                redirect publisherInstance
            }
            '*'{ respond publisherInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Publisher publisherInstance) {

        if (publisherInstance == null) {
            notFound()
            return
        }

        publisherInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Publisher.label', default: 'Publisher'), publisherInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'publisher.label', default: 'Publisher'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
