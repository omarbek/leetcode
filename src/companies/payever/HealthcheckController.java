package companies.payever;

//@RestController
//@RequestMapping("healthcheck")
public class HealthcheckController {

//    @RequestMapping(produces = "application/json", method = RequestMethod.GET)
//    public ResponseEntity<Time> get(@RequestParam("format") String format) {
//        if (format == null || format.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//        Time time = new Time();
//        if (Format.FULL.getFormat().equals(format)) {
//            time.setCurrentTime(ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_INSTANT));
//            time.setStatus(HttpStatus.OK.getReasonPhrase());
//        } else if (Format.SHORT.getFormat().equals(format)) {
//            time.setStatus(HttpStatus.OK.getReasonPhrase());
//        } else {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//
//        return new ResponseEntity<>(time, HttpStatus.OK);
//    }
}

enum Format {

    SHORT("short"),
    FULL("full");

    private String format;

    Format(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

class Time {

    //    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String currentTime;
    private String status;

    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}