<h2><a href="https://www.geeksforgeeks.org/problems/primitive-typing5427/1">Minimum Moves to Type a String</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given a screen containing alphabets from a-z, we can go from one character to </span><span style="font-size: 18px;">another character</span><span style="font-size: 18px;"> using a remote.&nbsp;</span><span style="font-size: 18px;">Find the shortest possible path to type all characters of a given string using the remote. </span></p>
<ul>
<li><span style="font-size: 18px;">The initial position is top left and all characters of input string should be printed in order. </span></li>
<li><span style="font-size: 18px;">Find the total number of minimum moves in such a path(Move UP, DOWN, LEFT, RIGHT). </span></li>
<li><span style="font-size: 18px;">Pressing OK also accounts for one move.</span></li>
</ul>
<p><img style="max-width: 98%; margin: 1%;" src="https://media.geeksforgeeks.org/wp-content/uploads/20260610181115038803/sasa_s.webp" alt="sasa_s" width="163" height="190"></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "abc"
<strong>Output: </strong>5
<strong>Explanation: </strong>Remote's position is at 'a' initially. So 'a' -&gt; 'b' = 1 step,'b'-&gt; 'c'= 1 step. Three OK moves will also be needed to print the three characters.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>s = "gfg"
<strong>Output: </strong>7
<strong>Explanation: </strong>Remote is initially at 'a'. Two moves needed to reach 'g', then one more for 'f' and one more for 'g'. Three moves are needed for OK. Total moves = 2 + 1 + 1 + 3 = 7</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= |str| &lt;= 10<sup>5</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Accolite</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Matrix</code>&nbsp;