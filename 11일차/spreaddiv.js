(function($) {
  function SpreadDiv(option) {
    this.$plusbtn = $(option.plusid);
    this.$minusbtn = $(option.minusid);
    this.$spreaddiv = option.spreadid;
    this.initEvent();
  }
  SpreadDiv.prototype.initEvent = function() {
    var $spread = this.$spreaddiv;
    this.$plusbtn.on('click', function() {
      $spread.show().animate({
        height: 200},
        500, function() {
      });
    });
    this.$minusbtn.on('click', function() {
      $spread.animate({
        height: 0},
        500, function() {
        $spread.hide();
      });
    });
  }

  $.fn.spreadPanel = function(option) {
    this.each(function(index) {
      var panel = new SpreadDiv({
        plusid: option.plusid,
        minusid: option.minusid,
        spreadid: $(this)
      });
    });
    return this;
  }
})(jQuery);
