<?php
	/**
	 * @author "Jakub Čábera"
	 * Tohle je prakticky copy-paste z mého JAVA souboru s číslama.
	 * Je to asi zbytečné, ale když už tak všechno (:
	 */
	function factorial($N){
		if($N < 2){
			return 1;
		} else {
			return ($N * factorial($N - 1));
		}
	}

	function sumDigits($value){
		$sum = 0;
		while($value > 0){
			$sum += $value % 10;
			$value /= 10;
		}
		$sum += $value;
		return $sum;
	}

	function countDigits($value){
		return strlen($value);
	}

	function toBinary($value){
		$binStr = '';
		while($value >= 1){
			$bin   = $value % 2;
			$value = round($value / 2, 0, PHP_ROUND_HALF_DOWN);
			$binStr .= $bin;
		}
		$binStr = strrev($binStr);
		return $binStr;
	}

	function toDecimal($value){
		$decimal = 0;
		$p       = 0;
		while(TRUE){
			if($value == 0){
				return;
			} else {
				$tmp = (int)$value % 10;
				$decimal += $tmp * pow(2, $p);
				$value /= 10;
				$p++;
			}
		}
		return $decimal;
	}

	function primeFactorization($value){
		$tmp   = $value;
		$final = "";
		for($index = 2; $index <= sqrt($tmp); $index++){
			while($tmp % $index == 0){
				$tmp /= $index;
				$final .= $index . " * ";
			}
		}
		if($tmp > 1) $final .= $tmp;
		return $final;
	}

	function collatz($value, &$max, &$count){
		//nad voláním funkce musí být vytvořeno:
		//  $max = 0;
		//  $count = 0;
		// poté předat funkci tyto proměnné
		echo $value . "<br />";
		if($value > $max){
			$max = $value;
		}
		if($value == 1){
			echo "Maximum je: " . $max;
			echo "<br />Počet Průchodů je: " . $count; //bez jedničky
			return;
		} else if($value % 2 == 0){
			$count++;
			collatz($value / 2, $max, $count);
		} else {
			$count++;
			collatz(3 * $value + 1, $max, $count);
		}
	}

	class sorty{
		function quciksort($array){
			if(count($array) < 2){
				return $array;
			}
			$left = $right = [];
			reset($array);
			$pivot_key = key($array);
			$pivot     = array_shift($array);
			foreach($array as $k => $v){
				if($v < $pivot) $left[$k] = $v; else
					$right[$k] = $v;
			}
			return array_merge(quicksort($left), [$pivot_key => $pivot], quicksort($right));
		}

		function bubble(&$array){
			$count = count($array);
			for($i = 0; $i < $count - 1; $i++){
				for($j = 0; $j < $count - $i - 1; $j++){
					if($array[$j + 1] < $array[$j]){
						$tmp           = $array[$j + 1];
						$array[$j + 1] = $array[$j];
						$array[$j]     = $tmp;
					}
				}
			}
		}

		function insert(&$array){
			$array_size = count($array);
			$tmp        = NULL;
			for($i = 0; $i < $array_size; $i++){
				$j = $i + 1;
				if($j == $array_size){
					break;
				}
				while($array[$j] < $array[$i]){
					$tmp       = $array[$i];
					$array[$i] = $array[$j];
					$array[$j] = $tmp;
					if($i > 0){
						$i--;
					}
					$j--;
				}
			}
		}

		function select($array){
			for($i = 0; $i < count($array); ++$i){
				$min    = NULL;
				$minKey = NULL;
				for($j = $i; $j < count($array); ++$j){
					if(NULL === $min || $array[$j] < $min){
						$minKey = $j;
						$min    = $array[$j];
					}
				}
				$array[$minKey] = $array[$i];
				$array[$i]      = $min;
			}
			return $array;
		}
	}

?>
