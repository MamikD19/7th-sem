ask_question();
$answer = get_answer();
# some code
ask_question();
$second_answer = get_answer();
 
########## sub declarations come here
 
sub ask_question {
  print "Have we arrived already?";
  return;
}
 
sub get_answer {
 $answer = <STDIN>;
  chomp $answer;
  return $answer;
}
