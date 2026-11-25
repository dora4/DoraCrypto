# The Day 1.52 Million People Had Their Data Leaked — They Did Nothing Wrong

## You May Have Understood "Encryption" Wrong All Along

On November 20, Korea Electric Power Corporation (KEPCO) released an announcement that sent shockwaves through 1.52 million people.

Its customer service platform *Hanjeon ON* and electronic procurement system came under external attack, exposing roughly 1.52 million sets of personal information: 650,487 regular users, plus 869,761 corporate representatives and employees registered on the e-procurement system.

Names, phone numbers, residential addresses, electricity usage records and corporate procurement history were all laid bare to the attackers.

Among these 1.52 million people, some may have only signed up for *Hanjeon ON* to check their electricity bills. Others may have merely submitted a vendor quotation on the procurement portal. What did they do wrong?

Nothing at all.

They simply trusted a platform — and that platform failed them.

What makes it even more absurd: this was KEPCO’s second data breach in a single month. The prior incident exposed personal data of 35,528 internal staff and retirees. One organization, two massive leaks within 30 days. Was it a shortage of security budget? An incompetent tech team? Neither.

**The core problem: once data is stored somewhere, it can be taken.**

---

## “We Adopt Industry-Leading Encryption Technology”

Nearly every time a data breach hits, the company involved puts out a statement along these lines.

KEPCO’s notice mentioned “cutting off external access to affected systems” and “cooperating with investigative authorities to clarify the incident.” After the 15.72 million account leak at Lotte Securities, emergency measures were taken to “isolate the affected zones.” When data on 46,000 TSMC employees was circulated online, TSMC stated there was “no evidence its own information systems had been compromised.”

But have you noticed a pattern?

These companies talk about their systems being secure. They almost never say your data is secure.

The two are worlds apart.

System security means firewalls hold against direct assaults, intrusion detection systems are active, and vulnerability patches are applied on time. It means the city walls are still standing.

Data security means that even if attackers bypass those walls — via supply chains, insiders, or zero-day exploits — whatever they steal remains **unreadable**.

Most companies manage the first. Very few deliver the second.

Pulling that off requires one thing: **end-to-end encryption, with encryption keys held by you, not the platform.**

---

## Why Does Key Ownership Matter So Much?

Here’s an analogy.

You place valuables in a bank safe deposit box. The bank says: “Rest assured, we use state-of-the-art locks.”

But the bank holds a spare key. Bank managers, security staff, IT administrators — anyone with vault access could theoretically open your box. Worse still, if the bank uses identical lock models, someone who learns how to pick one can open every box.

This describes most cloud storage today. The service provider encrypts your data, stores the keys, and handles decryption for you. It’s convenient. It stays safe — *as long as the provider itself stays secure*.

But events in 2026 show us that provider breaches are no longer a rare edge case.

KEPCO was breached. Lotte Securities was breached. A TSMC supplier was breached. A supply-chain compromise on Optimizely poisoned websites belonging to 178 clients — BBC, CNN, HSBC, Zoom, household names all.

**When attackers slip in through a supply-chain flaw and keys are controlled by the service provider, the attackers effectively grab the keys to every safe deposit box.**

---

## Encryption Done Right: You Lock It, You Manage It, You Hold the Key

DoraBox’s premise is straightforward:
**Your private data is encrypted locally by you, and only you hold the encryption keys.**

More specifically:
DoraBox uses a client-side encryption architecture. Your data is encrypted on your device before it ever leaves your phone. Anything uploaded to the cloud, synced to servers, or backed up across nodes travels as ciphertext the entire time. The server only stores and transmits encrypted data and never participates in encryption or decryption.

What this means: even if an attacker breaches the server, all they get is unintelligible garbage. Without your key, the stolen data is worthless.

It is not just “we use industry-leading encryption” — though that is true. The far bigger promise is: **we hand the keys over to you.**

That distinction sounds small. During a data breach, it is the entire difference between your photos turning up on the dark web and an attacker dumping useless ciphertext and moving on.

---

## A Common Question: What If I Lose My Keys?

Excellent question.

Traditional security products treat security and convenience as opposites: tighter security means more hassle, and easier access means higher risk.

DoraBox strikes a balance:
It offers key backup and recovery workflows, but recovery itself requires strong identity verification. Multi-device key sync is supported, and the sync channel is end-to-end encrypted. You may assign emergency contacts, but their permissions are limited, time-bound, and revocable.

Put simply: DoraBox does not force you to leave the door unlocked out of fear of losing your key. It gives you a strong lock plus a reliable recovery plan — one that cannot be exploited as a backdoor for attackers.

---

## The Reality of 2026: It Is No Longer a Question of *If*, but *When*

If you follow tech news, data breaches have shifted from rare emergencies to routine headlines.

On November 23, China’s Ministry of Industry and Information Technology named 23 apps and SDKs in its seventh notice of violations harming user rights. On November 16, it released its third batch of fraud-linked apps, flagging 46 applications abused for telecom scams. Japan recorded over 100 million personal records leaked in a single year. One Optimizely supply-chain vulnerability poisoned websites across 178 global organizations.

One hundred and seventy-two countries have enacted data protection laws. China’s special campaign on personal information protection entered a more intensive enforcement phase in 2026. The policy direction is clear.

Yet laws can only deter companies from actively misusing data. They cannot outpace hackers, who always move faster than security patches.

You cannot assume every platform you trust will never be compromised. What you can do before handing over your data is ask one critical question:

**If this platform gets hacked, can my stolen data still be decrypted?**

If you hold the key: the answer is no.
If the platform holds the key: the answer is yes — and by then, it is already too late.

That is the core idea behind DoraBox:
**True privacy protection is not trusting that a platform will never leak your data. It is guaranteeing that even when the platform is breached, your data remains yours.**

---

## Final Thought

Those 1.52 million KEPCO users, 15.72 million Lotte Securities customers, 46,000 TSMC employees, and 10.78 million patrons of Korean barbecue chain *King of Pork Belly* all believed they had chosen secure platforms before their breaches.

Security is not blind trust in others. Security is building a last line of defense for when that trust breaks.

The key should stay in your hands.