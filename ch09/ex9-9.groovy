// 9.9 Making a CSV Request

def partialCsvRequest = "http://geocoder.us/service/csv/geocode?address="
def address = "1600 Pennsylvania Ave, Washington DC"
def csvUrl = new URL(partialCsvRequest + URLEncoder.encode(address))
def csvResponse = csvUrl.text


// Parsing a CSV Response

//Response:
38.898748,-77.037684,1600 Pennsylvania Ave NW,Washington,DC,20502

def csvResponse = csvUrl.text
def tokens = csvResponse.split(",")
println "Latitude:  [${tokens[0]}]"
println "Longitude: [${tokens[1]}]"
println "Address:   [${tokens[2]}]"
println "City:      [${tokens[3]}]"
println "State:     [${tokens[4]}]"
println "Zip:       [${tokens[5]}]"
